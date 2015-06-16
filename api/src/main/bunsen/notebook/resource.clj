(ns bunsen.notebook.resource
  (:require [liberator.core :refer [defresource]]
            [bunsen.common.helper.resource :refer [defaults]]
            [bunsen.notebook.resource.seed :refer [seed]]
            [bunsen.notebook.resource.seed-publications :refer [seed-publications]]
            [bunsen.notebook.resource.seed-projects :refer [seed-projects]]
            [bunsen.notebook.resource.seed-notebooks :refer [seed-notebooks]]
            [bunsen.notebook.resource.publication :refer [publication]]
            [bunsen.notebook.resource.project :refer [project]]
            [bunsen.notebook.resource.projects :refer [projects]]
            [bunsen.notebook.resource.notebook :refer [notebook]]
            [bunsen.notebook.resource.notebook-contents :refer [notebook-contents]]
            [bunsen.notebook.resource.notebook-import :refer [notebook-import]]
            [bunsen.notebook.resource.notebooks :refer [notebooks]]
            [bunsen.notebook.resource.publication-contents :refer [publication-contents]]
            [bunsen.notebook.resource.publications :refer [publications]]
            [bunsen.notebook.resource.publications-count :refer [publications-count]]
            [bunsen.notebook.resource.contributors :refer [contributors]]
            [bunsen.notebook.resource.category :refer [category]]
            [bunsen.notebook.resource.categories :refer [categories]]
            [bunsen.notebook.resource.rating :refer [rating]]
            [bunsen.notebook.resource.ratings :refer [ratings]]))

(defresource status [_] defaults
  :handle-ok (constantly "ok"))

(def resources
  {:status status
   :publication publication
   :publications publications
   :publications-count publications-count
   :publication-contents publication-contents
   :project project
   :projects projects
   :notebook notebook
   :notebooks notebooks
   :notebook-contents notebook-contents
   :notebook-import notebook-import
   :category category
   :categories categories
   :contributors contributors
   :rating rating
   :ratings ratings
   :seed seed
   :seed-publications seed-publications
   :seed-projects seed-projects
   :seed-notebooks seed-notebooks})