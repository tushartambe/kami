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

(defn change-all [board position old-color new-color]
  (loop [positions #{position}
         board board]
    (if (empty? positions)
      board
      (let [new-positions (mapcat (partial neighbors-of-same-color board old-color) positions)]
        (recur new-positions (change board positions new-color))))))