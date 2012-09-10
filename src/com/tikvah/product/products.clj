(ns com.tikvah.product.products
  (:use com.tikvah.http.json)
  (:require [com.tikvah.product.repository :as repo]))



(defn find-product [id]
   (repo/get-product id)
  )

(defn create-product [{:keys [id name price]}]
    (repo/create-product {:id id :name name :price price})
  )

(defn update-product [{:keys [id name price] :or {name "" price 0}}]
  (str "product with id " id "is updated with name " name "and price " price)
  )

(defn find-products [& ids]
  (map #(hash-map "id" % "name" "test product" "price" "$25") ids)
  )

