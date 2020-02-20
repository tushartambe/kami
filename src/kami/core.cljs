(ns kami.core
  (:require
    [reagent.core :as r]
    [kami.logic :as l]))

;; -------------------------
;; Views

(def raw-data {:board        [[0 0 0 1 1 1 1 2 0 0 0 1 1 1 2 2]
                              [2 0 3 3 3 0 2 2 2 0 0 1 1 1 2 2]
                              [0 0 0 0 0 2 2 2 2 2 0 1 1 1 2 2]
                              [0 0 0 1 2 2 2 2 2 2 2 1 1 1 2 2]
                              [2 0 3 2 2 2 2 2 2 2 2 2 1 1 2 2]
                              [0 0 0 0 2 2 2 2 2 2 2 1 1 1 2 2]
                              [0 0 0 1 1 2 2 2 2 2 0 1 1 1 2 2]
                              [2 0 3 3 3 0 2 2 2 0 0 1 1 1 2 2]
                              [0 0 0 0 0 1 4 2 0 0 0 1 1 1 2 2]]
               :level        0
               :best-so-far  5
               :no-of-colors 5})

(defonce board (r/atom (:board raw-data)))
(defonce selected-color (r/atom 1))
(defonce total-moves (r/atom 0))
(defonce won? (r/atom false))

(def sample-colors [[0 "darkred"] [1 "midnightblue"] [2 "green"] [3 "purple"] [4 "deeppink"] [5 "lightblue"] [6 "maroon"] [7 "orange"] [8 "silver"]])
(def colors (into {} (take (:no-of-colors raw-data) sample-colors)))

(defn change-board [position old-color]
  (when-not (= old-color @selected-color)
    (swap! board l/change-all position old-color @selected-color)
    (swap! total-moves inc)
    (when (l/game-won? @board)
      (reset! won? true)
      )
    ))

(defn create-divs [row-index index element]
  (let [cell (get-in @board [row-index index])]
    [:div {:class   "element"
           :id      (str row-index " " index)
           :onClick (partial change-board [row-index index] cell)
           :style   {:background-color (colors cell)}
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

(defn home-page []
  [:div {:class "page"}
   [:div {:class "header"}
    [:h2 "KAMI"]
    [:div
     {:class "score"}
     [:span "Total Moves : " @total-moves]
     [:span "Best So Far : " (:best-so-far raw-data)]]
    ]
   [:div {:class "board"} (map-indexed render-row @board)]
   [:div {:class "color-palatte"} (map (partial create-color-palatte @selected-color) colors)]
   (when @won? [:button {:class "next-level"} ">"])
   ]
  )

;; -------------------------
;; Initialize app
(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
