package nl.vu.kai.dl4python.datatypes

trait Annotation
case class LabelAnnotation(name: Name, label: String, language: String) extends Annotation

case class SeeAlsoAnnotation(name: Name, ref: String) extends Annotation