(ns kami.core
  (:require
    [reagent.core :as r]
    [kami.logic :as l]))

;; -------------------------
;; Views

(def raw-data [{:board        [
                               [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                               [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                               [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                               [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                               [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                               [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                               [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                               [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                               [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                               [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                               ]
                :level        0
                :best-so-far  2
                :no-of-colors 2}
               {:board        [
                               [0 0 0 1 1 1 1 2 0 0 0 1 1 1 2 2]
                               [0 0 0 1 1 1 1 2 0 0 0 1 1 1 2 2]
                               [0 0 0 1 1 1 1 2 0 0 0 1 1 1 2 2]
                               [0 0 0 1 1 1 1 2 0 0 0 1 1 1 3 3]
                               ]
                :level        1
                :best-so-far  10
                :no-of-colors 4} {}])

(defonce level (r/atom 0))
(defonce board (r/atom (:board (raw-data @level))))
(defonce selected-color (r/atom 0))
(defonce total-moves (r/atom 0))
(defonce won? (r/atom false))


(def sample-colors [[0 "#ff6b6b"] [1 "#5f27cd"] [2 "#48dbfb"] [3 "gray"] [4 "#1dd1a1"] [5 "#576574"] [6 "#ff9ff3"] [7 "#00d2d3"] [8 "#feca57"] [9 "#54a0ff"]])
(defn colors [number-of-colors] (into {} (take number-of-colors sample-colors)))

(defn apply-move [position old-color]
  (when (< @total-moves (:best-so-far (raw-data @level)))
    (when-not (and (= old-color @selected-color))
      (swap! board l/change-all position old-color @selected-color)
      (swap! total-moves inc)
      (when (l/game-won? @board)
        (reset! won? true)
        )
      )))

(defn create-divs [row-index index element]
  (let [cell (get-in @board [row-index index])]
    [:div {:class   "element"
           :id      (str row-index " " index)
           :onClick (partial apply-move [row-index index] cell)
           :style   {:background-color ((colors (:no-of-colors (raw-data @level))) cell)}
           :key     (str "element" row-index "-" index)
           }])
  )

(defn render-row [index row]
  [:div {:class "row"
         :id    (str "row" index)
         :key   (str "row-" index)
         }
   (map-indexed (partial create-divs index) row)])

(defn select-color-from-palatte [color]
  (reset! selected-color (first color)))

(defn create-color-palatte [current-color color]
  [:div {:class   ["palatte-div" (if (= current-color (first color)) "selected" "")]
         :style   {:background-color (last color)}
         :onClick (partial select-color-from-palatte color)
         :key     color
         }])

(defn change-level [f]
  (swap! level f)
  (reset! board (:board (raw-data @level)))
  (reset! won? false)
  (reset! total-moves 0)
  (reset! selected-color 0)
  )

(defn reset-current-level []
  (reset! board (:board (raw-data @level)))
  (reset! won? false)
  (reset! total-moves 0)
  (reset! selected-color 0)
  )

(defn home-page []
  [:div {:class "page"}
   [:div {:class "header"}
    [:h2 "KAMI"]
    (when @won? [:h4 {:class "winning-message"} "Level completed!"])]

   [:div {:class "play-ground"}
    [:div {:class "board-container"}
     [:div {:class "board"} (map-indexed render-row @board)]

     [:div {:class "color-palatte"}
      (map (partial create-color-palatte @selected-color)
           (colors (:no-of-colors (raw-data @level))))]]

    [:div {:class "sidebar"}
     [:div {:class "levels"}
      [:div {:class ["current-level"]} @level]
      [:div {:class "change-level"}

       (when (> @level 0)
         [:div {:class   ["level" "level-btn"]
                :onClick (partial change-level dec)} "<"])

       (when (and @won? (> (dec (count raw-data)) @level))
         [:div {:class   ["level" "level-btn"]
                :onClick (partial change-level inc)} ">"])]]

     [:div {:class "moves"}
      [:div {:class "player-moves"} @total-moves]
      [:div {:class "total-moves"}
       [:div {:class "level"} (:best-so-far (raw-data @level))]]]

     [:div {:class "reset"}
      [:div {:class   "reset-btn"
             :onClick reset-current-level}]]]]])

;; -------------------------
;; Initialize app
(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
