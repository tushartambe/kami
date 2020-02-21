(ns kami.logic)

(def offsets [[-1 0] [1 0] [0 -1] [0 1]])
(def sum (partial mapv +))

(defn neighbors-of-same-color [board color position]
  (->> offsets
       (map (partial sum position))
       (filter (comp (partial = color) (partial get-in board)))))

(defn change [board positions new-color]
  (reduce #(assoc-in %1 %2 new-color) board positions))

(defn game-won? [board]
  (= 1 (count (into #{} (flatten board)))))

;(defn change-all [board position old-color new-color]
;  (loop [positions #{position}
;         board board]
;    (if (empty? positions)
;      board
;      (let [new-positions (mapcat (partial neighbors-of-same-color board old-color) positions)]
;        (recur new-positions (change board positions new-color))))))
;-------------------------

(defn expand [board color positions]
  (into positions (mapcat (partial neighbors-of-same-color board color) positions)))

(defn get-all-positions [board pos old-color]
  (loop [board board
         pos #{pos}]
    (if (= pos (expand board old-color pos))
      pos
      (recur board (expand board old-color pos)))))

;(defn changer [positions selected-color]
;  (loop [pos (into [] positions)]
;    (when-not (empty? pos)
;      (do
;        (js/setTimeout #(reset! board (l/change @board #{(first pos)} selected-color)) 100)
;        (recur (rest pos))))))

(defn change-all [board position old-color new-color]
  (change board (get-all-positions board position old-color) new-color)
  )