(ns kami.core
  (:require
    [reagent.core :as r]
    [kami.logic :as l]
    [kami.data :as d]
    ))

(defonce level (r/atom 0))
(defonce board (r/atom (:board (d/raw-data @level))))
(defonce selected-color (r/atom 0))
(defonce total-moves (r/atom 0))
(defonce won? (r/atom false))
(defn colors [number-of-colors] (into {} (take number-of-colors d/sample-colors)))

(defn apply-move [position old-color]
  (when (< @total-moves (:best-so-far (d/raw-data @level)))
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
           :style   {:background-color ((colors (:no-of-colors (d/raw-data @level))) cell)}
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
  (reset! board (:board (d/raw-data @level)))
  (reset! won? false)
  (reset! total-moves 0)
  (reset! selected-color 0)
  )

(defn reset-current-level []
  (reset! board (:board (d/raw-data @level)))
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
           (colors (:no-of-colors (d/raw-data @level))))]]

    [:div {:class "sidebar"}
     [:div {:class "levels"}
      [:div {:class ["current-level"]} @level]
      [:div {:class "change-level"}

       (when (> @level 0)
         [:div {:class   ["level" "level-btn"]
                :onClick (partial change-level dec)} "<"])

       (when (and @won? (> (dec (count d/raw-data)) @level))
         [:div {:class   ["level" "level-btn"]
                :onClick (partial change-level inc)} ">"])]]

     [:div {:class "moves"}
      [:div {:class "player-moves"} @total-moves]
      [:div {:class "total-moves"}
       [:div {:class "level"} (:best-so-far (d/raw-data @level))]]]

     [:div {:class "reset"}
      [:div {:class   "reset-btn"
             :onClick reset-current-level}]]]]])

;; -------------------------
;; Initialize app
(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
