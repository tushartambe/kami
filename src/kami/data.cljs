(ns kami.data)
(def raw-data [
               {:board [[0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                        [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                        [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                        [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                        [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                        [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                        [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                        [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                        [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
                        [0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]],
                :best-so-far 1,
                :no-of-colors 2,
                :level 1}
               {:board [[1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 1 1 0 0 0 0 0 0 0 0 0 0 1 1 1]
                        [1 1 1 0 0 0 0 0 0 0 0 0 0 1 1 1]
                        [1 1 1 0 0 0 0 0 0 0 0 0 0 1 1 1]
                        [1 1 1 0 0 0 0 0 0 0 0 0 0 1 1 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]],
                :best-so-far 1,
                :no-of-colors 2,
                :level 1}
               {:board [[1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 1 1 0 0 0 2 2 2 2 0 0 0 1 1 1]
                        [1 1 1 0 0 0 2 2 2 2 0 0 0 1 1 1]
                        [1 1 1 0 0 0 2 2 2 2 0 0 0 1 1 1]
                        [1 1 1 0 0 0 2 2 2 2 0 0 0 1 1 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]],
                :best-so-far 2,
                :no-of-colors 3,
                :level 1}
               {:board [[2 2 1 1 1 1 1 1 1 1 1 1 1 1 2 2]
                        [2 2 1 2 2 2 2 2 2 2 2 2 2 1 2 2]
                        [2 2 1 2 0 0 0 0 0 0 0 0 2 1 2 2]
                        [2 2 1 2 0 2 2 2 2 2 2 0 2 1 2 2]
                        [2 2 1 2 0 2 0 0 0 0 2 0 2 1 2 2]
                        [2 2 1 2 0 2 0 0 0 0 2 0 2 1 2 2]
                        [2 2 1 2 0 2 2 2 2 2 2 0 2 1 2 2]
                        [2 2 1 2 0 0 0 0 0 0 0 0 2 1 2 2]
                        [2 2 1 2 2 2 2 2 2 2 2 2 2 1 2 2]
                        [2 2 1 1 1 1 1 1 1 1 1 1 1 1 2 2]],
                :best-so-far 3,
                :no-of-colors 3,
                :level 1}
               {:board [[1 1 1 2 2 1 1 1 0 0 0 0 0 1 1 1]
                        [1 1 2 2 1 1 1 0 0 1 1 1 0 0 1 1]
                        [1 2 2 1 1 1 0 0 1 1 1 1 1 0 0 1]
                        [2 2 1 1 1 0 0 1 1 1 1 1 1 1 0 0]
                        [1 1 1 1 0 0 1 1 1 1 1 1 1 1 1 0]
                        [2 2 1 1 1 0 0 1 1 1 1 1 1 1 1 1]
                        [1 2 2 1 1 1 0 0 1 1 1 1 1 1 1 0]
                        [1 1 2 2 1 1 1 0 0 1 1 1 1 1 0 0]
                        [1 1 1 2 2 1 1 1 0 0 1 1 1 0 0 1]
                        [1 1 1 1 2 2 1 1 1 0 0 1 1 0 1 1]],
                :best-so-far 4,
                :no-of-colors 3,
                :level 1}
               {:board [[0 0 0 0 0 0 1 1 1 2 2 0 0 0 0 0]
                        [0 0 0 0 0 0 1 1 1 2 2 0 0 0 0 0]
                        [0 0 0 0 0 0 1 1 1 2 2 0 0 0 0 0]
                        [0 0 0 0 0 0 1 1 1 2 2 0 0 0 0 0]
                        [0 0 0 0 3 0 1 1 1 2 2 0 0 0 0 0]
                        [0 0 0 3 3 0 1 1 1 2 2 0 0 0 0 0]
                        [0 0 3 3 3 3 3 3 3 3 3 3 3 3 0 0]
                        [0 0 0 3 3 0 1 1 1 2 2 0 0 0 0 0]
                        [0 0 0 0 3 0 1 1 1 2 2 0 0 0 0 0]
                        [0 0 0 0 0 0 1 1 1 2 2 0 0 0 0 0]],
                :best-so-far 3,
                :no-of-colors 4,
                :level 1}
               {:board [[2 2 2 2 2 2 1 2 2 1 2 2 2 2 2 2]
                        [2 2 2 2 2 2 1 2 2 1 2 2 2 2 2 2]
                        [2 2 2 0 0 0 3 3 3 3 0 0 0 2 2 2]
                        [2 2 2 0 0 0 3 3 3 3 0 0 0 2 2 2]
                        [2 2 2 0 0 0 3 3 3 3 0 0 0 2 2 2]
                        [2 2 2 0 0 0 3 3 3 3 0 0 0 2 2 2]
                        [2 2 2 0 0 0 3 3 3 3 0 0 0 2 2 2]
                        [2 2 2 2 2 2 1 2 2 1 2 2 2 2 2 2]
                        [2 2 2 2 2 2 1 2 2 1 2 2 2 2 2 2]
                        [2 2 2 2 2 2 1 2 2 1 2 2 2 2 2 2]],
                :best-so-far 3,
                :no-of-colors 4,
                :level 1}
               {:board [[3 3 3 4 4 4 1 1 3 2 3 1 1 4 3 0]
                        [3 2 3 3 4 4 4 1 1 3 2 3 1 1 4 3]
                        [3 3 2 3 3 4 4 4 1 1 3 2 3 1 1 4]
                        [3 3 3 2 3 3 4 4 4 1 1 3 2 3 1 1]
                        [2 3 3 3 2 3 3 4 4 4 1 1 3 2 3 1]
                        [2 2 3 3 3 2 3 3 4 4 4 1 1 3 2 3]
                        [0 2 2 3 3 3 2 3 3 4 4 4 1 1 3 2]
                        [0 0 2 2 3 3 3 2 3 3 4 4 4 1 1 3]
                        [0 0 0 2 2 3 3 3 2 3 3 4 4 4 1 1]
                        [0 0 0 0 2 3 3 3 3 3 3 3 4 4 4 1]],
                :best-so-far 7,
                :no-of-colors 5,
                :level 1}
               {:board [[0 0 1 1 1 2 2 1 1 1 1 2 0 0 2 1]
                        [0 0 1 1 1 2 2 1 0 0 1 2 0 0 2 1]
                        [0 0 1 1 1 2 2 1 0 0 1 2 0 0 2 1]
                        [0 0 1 1 1 2 2 1 1 1 1 2 0 0 2 1]
                        [0 0 1 1 1 2 2 1 0 0 1 2 0 0 2 1]
                        [0 0 1 1 1 2 2 1 0 0 1 2 0 0 2 1]
                        [0 0 1 1 1 2 2 1 1 1 1 2 0 0 2 1]
                        [0 0 1 1 1 2 2 1 0 0 1 2 0 0 2 1]
                        [0 0 1 1 1 2 2 1 0 0 1 2 0 0 2 1]
                        [0 0 1 1 1 2 2 1 1 1 1 2 0 0 2 1]],
                :best-so-far 4,
                :no-of-colors 3,
                :level 1}
               {:board [[2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2]
                        [2 0 0 0 0 0 0 0 2 2 2 2 2 1 1 2]
                        [2 0 2 2 2 2 2 0 2 2 2 2 2 1 1 2]
                        [2 0 2 0 0 0 2 0 2 2 2 2 2 2 2 2]
                        [2 0 2 0 1 0 2 0 2 2 1 1 1 1 1 2]
                        [2 0 2 0 1 0 2 0 2 2 1 2 2 2 1 2]
                        [2 0 2 0 0 0 2 0 2 2 1 2 0 2 1 2]
                        [2 0 2 2 2 2 2 0 2 2 1 2 2 2 1 2]
                        [2 0 0 0 0 0 0 0 2 2 1 1 1 1 1 2]
                        [2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2]],
                :best-so-far 4,
                :no-of-colors 3,
                :level 1}
               {:board [[2 2 2 2 2 2 2 1 0 0 0 0 0 0 0 0]
                        [2 0 0 0 2 2 2 1 3 3 3 1 0 0 0 0]
                        [2 0 0 0 1 1 1 1 3 3 3 1 1 1 1 1]
                        [2 1 1 1 0 0 0 0 0 0 0 1 1 1 1 1]
                        [2 1 1 1 0 0 0 0 0 0 0 1 1 1 1 1]
                        [2 2 2 2 3 2 2 2 2 2 2 2 2 2 2 2]
                        [1 1 1 1 0 0 0 2 2 0 0 0 2 2 2 2]
                        [1 1 1 1 0 0 0 2 2 0 0 0 2 2 2 2]
                        [0 0 0 0 1 1 1 2 2 2 2 2 2 3 3 3]
                        [0 0 0 0 1 1 1 2 2 2 2 2 2 3 3 3]],
                :best-so-far 4,
                :no-of-colors 4,
                :level 1}
               {:board [[0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0]
                        [0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0]
                        [0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0]
                        [0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0]
                        [0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0]
                        [0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0]
                        [0 0 0 0 0 1 0 0 0 0 0 2 0 2 0 0]
                        [0 0 0 0 1 0 0 0 0 0 0 0 2 0 0 0]
                        [0 0 0 1 0 0 0 0 0 0 0 2 0 2 0 0]
                        [0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0]],
                :best-so-far 3,
                :no-of-colors 3,
                :level 1}
               {:board [[2 2 3 3 2 2 2 2 0 2 2 0 2 2 2 2]
                        [2 2 3 3 2 2 2 0 2 2 0 2 2 2 2 2]
                        [0 0 2 2 2 2 3 2 2 0 2 2 2 2 2 2]
                        [0 0 2 2 2 0 2 2 3 2 2 2 2 2 2 2]
                        [2 2 2 2 0 2 2 0 2 2 2 2 2 2 2 2]
                        [2 2 2 0 2 2 0 2 2 2 2 2 2 2 2 2]
                        [2 2 0 2 2 0 2 2 2 2 2 2 1 2 1 2]
                        [2 0 2 2 0 2 2 2 2 2 2 2 2 1 2 2]
                        [2 2 2 0 2 2 2 2 2 2 2 2 1 2 1 2]
                        [2 2 0 2 2 2 2 2 2 2 2 2 2 2 2 2]],
                :best-so-far 4,
                :no-of-colors 4,
                :level 1}
               {:board [[2 2 2 2 2 2 2 2 2 0 2 2 2 2 2 2]
                        [2 2 2 2 2 2 2 2 3 2 2 2 1 2 1 2]
                        [2 2 2 2 2 2 2 0 2 2 2 2 2 1 2 2]
                        [2 2 2 2 2 2 0 2 0 2 2 2 1 2 1 2]
                        [2 2 2 2 2 0 2 2 2 3 2 2 2 2 2 2]
                        [2 2 2 2 3 2 2 2 2 2 0 2 2 2 2 2]
                        [2 2 2 0 2 2 2 2 2 2 2 0 2 2 2 2]
                        [2 2 0 2 2 2 1 2 1 2 2 2 0 2 2 2]
                        [2 0 2 2 2 2 2 1 2 2 2 2 2 0 2 2]
                        [0 2 2 2 2 2 1 2 1 2 2 2 2 2 0 2]
                        ],
                :best-so-far 5,
                :no-of-colors 4,
                :level 1}
               {:board [[2 2 2 1 1 2 2 2 0 0 0 0 0 2 2 2]
                        [2 2 1 1 2 2 2 0 0 2 2 2 0 0 2 2]
                        [2 1 1 2 2 2 0 0 2 2 1 2 2 0 0 2]
                        [1 1 2 2 2 0 0 2 2 1 1 1 2 2 0 0]
                        [1 2 2 2 0 0 2 2 1 1 2 1 1 2 2 0]
                        [2 2 2 0 0 2 2 1 1 2 0 2 1 1 2 2]
                        [1 2 2 2 0 0 2 2 1 1 2 1 1 2 2 0]
                        [1 1 2 2 2 0 0 2 2 1 1 1 2 2 0 0]
                        [2 1 1 2 2 2 0 0 2 2 1 2 2 0 0 2]
                        [2 2 1 1 2 2 2 0 0 2 2 2 0 0 2 2]],
                :best-so-far 5,
                :no-of-colors 3,
                :level 1}
               {:board [[3 3 3 3 3 3 3 3 4 3 0 3 2 3 1 3]
                        [3 3 3 3 3 3 3 3 4 3 0 3 2 3 1 3]
                        [1 1 1 1 1 1 1 1 1 1 1 1 2 1 1 1]
                        [3 3 3 3 3 3 3 3 4 3 0 3 2 3 1 3]
                        [2 2 2 2 2 2 2 2 4 2 2 2 2 2 2 2]
                        [3 3 3 3 3 3 3 3 4 3 0 3 2 3 1 3]
                        [4 4 4 4 4 4 4 4 4 4 0 4 4 4 1 4]
                        [3 3 3 3 3 3 3 3 4 3 0 3 2 3 1 3]
                        [0 0 0 0 0 0 0 0 4 0 0 0 2 0 1 0]
                        [3 3 3 3 3 3 3 3 4 3 0 3 2 3 1 3]],
                :best-so-far 5,
                :no-of-colors 5,
                :level 1}
               {:board [[1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [1 2 2 2 1 2 2 2 1 2 2 2 1 2 2 2]
                        [1 2 1 2 1 2 1 2 1 2 1 2 1 2 1 2]
                        [0 2 0 2 0 2 0 2 0 2 0 2 0 2 0 2]
                        [0 2 0 2 0 2 0 2 0 2 0 2 0 2 0 2]
                        [0 2 0 2 0 2 0 2 0 2 0 2 0 2 0 2]
                        [0 2 0 2 0 2 0 2 0 2 0 2 0 2 0 2]
                        [1 2 1 2 1 2 1 2 1 2 1 2 1 2 1 2]
                        [1 2 1 2 2 2 1 2 2 2 1 2 2 2 1 2]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]],
                :best-so-far 2,
                :no-of-colors 3,
                :level 1}
               {:board [[0 0 1 1 0 1 2 2 1 1 2 1 2 2 1 2]
                        [0 1 2 2 1 1 2 1 2 2 1 1 2 1 2 2]
                        [1 1 2 1 0 0 1 1 2 1 0 0 1 1 2 1]
                        [2 2 1 1 0 1 0 0 1 1 0 1 0 0 1 1]
                        [2 1 0 0 1 1 0 1 2 2 1 1 0 1 0 0]
                        [1 1 0 1 2 2 1 1 2 1 2 2 1 1 0 1]
                        [0 0 1 1 2 1 0 0 1 1 2 1 0 0 1 1]
                        [0 1 2 2 1 1 0 1 2 2 1 1 0 1 2 2]
                        [1 1 2 1 0 0 1 1 2 1 0 0 1 1 2 1]
                        [0 0 1 1 0 1 2 2 1 1 0 1 2 2 1 1]],
                :best-so-far 8,
                :no-of-colors 3,
                :level 1}
               {:board [[1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
                        [3 1 3 3 3 1 3 3 3 1 3 3 3 1 3 3]
                        [3 1 3 1 3 1 3 1 3 1 3 1 3 1 3 1]
                        [2 0 2 0 2 0 2 0 2 0 2 0 2 0 2 0]
                        [2 0 2 0 2 0 2 0 2 0 2 0 2 0 2 0]
                        [2 0 2 0 2 0 2 0 2 0 2 0 2 0 2 0]
                        [2 0 2 0 2 0 2 0 2 0 2 0 2 0 2 0]
                        [3 1 3 1 3 1 3 1 3 1 3 1 3 1 3 1]
                        [3 3 3 1 3 3 3 1 3 3 3 1 3 3 3 1]
                        [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]],
                :best-so-far 5,
                :no-of-colors 4,
                :level 1}
               {:board [[3 1 3 3 3 4 3 3 2 3 3 3 3 1 3 3]
                        [3 1 3 3 3 4 3 3 2 3 3 3 3 1 3 3]
                        [0 0 0 0 0 4 0 0 0 0 0 0 0 1 0 0]
                        [3 1 3 3 3 4 3 3 2 3 3 3 3 1 3 3]
                        [3 1 3 3 3 4 3 3 3 3 3 4 3 1 3 3]
                        [0 1 0 0 0 0 0 0 2 0 0 4 0 0 0 0]
                        [3 1 3 3 3 3 3 3 2 3 3 4 3 1 3 3]
                        [3 1 3 3 3 3 3 3 2 3 3 4 3 1 3 3]
                        [2 1 2 2 2 2 2 2 2 2 2 2 2 1 2 2]
                        [3 1 3 3 3 3 3 3 2 3 3 4 3 1 3 3]],
                :best-so-far 9,
                :no-of-colors 5,
                :level 1}
               {:board [[2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2]
                        [2 1 1 1 1 1 1 2 3 3 3 3 3 2 2 2]
                        [2 1 2 2 2 2 1 2 3 2 2 2 3 2 2 2]
                        [2 1 2 0 0 0 0 0 0 0 2 2 3 2 2 2]
                        [2 1 2 0 2 2 1 2 3 0 2 2 3 2 2 2]
                        [2 1 2 0 2 2 1 2 3 3 3 3 3 2 2 2]
                        [2 1 1 1 1 1 1 2 2 0 2 1 1 1 1 2]
                        [2 2 2 0 2 2 2 2 2 0 2 1 2 2 1 2]
                        [2 2 2 0 0 0 0 0 0 0 2 1 1 1 1 2]
                        [2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2]],
                :best-so-far 3,
                :no-of-colors 4,
                :level 1}])
(def sample-colors [[0 "#ff6b6b"] [1 "#5f27cd"][2 "#48dbfb"] [3 "gray"] [4 "#1dd1a1"] [5 "#576574"] [6 "#ff9ff3"] [7 "#00d2d3"] [8 "#feca57"] [9 "#54a0ff"]])
