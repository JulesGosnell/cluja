;;------------------------------------------------------------------------------
;; set up the namespace / module

(ns uk.org.gosnell.cluja
  (:gen-class)
  (:import
   [edu.syr.pcpratts.rootbeer.runtime Kernel Rootbeer]
   )
  )

;;------------------------------------------------------------------------------

;; define an implementation of Kernel

(deftype ClujaKernel [^int index ^ints inputs ^ints outputs]
  Kernel
  (gpuMethod [_] (aset outputs index (int (apply + inputs))))
  )

;;--------------------------------------------------------------------------------

;; make some kernels with input arrays and run them...

(defn ^int -main [& args]
  (let [threads 1024
        outputs (make-array (Integer/TYPE) threads)]
    (.runAll
     (Rootbeer.)
     (map
      (fn [i] (ClujaKernel. i (into-array (Integer/TYPE) (range 512)) outputs))
      (range threads)))
    
    (println (map identity outputs))
    ))

;;------------------------------------------------------------------------------
