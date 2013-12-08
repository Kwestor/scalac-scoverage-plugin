package scoverage

/** @author Stephen Samuel */
class CoverageFilter(excludedPackages: Seq[String]) {
  def isIncluded(className: String): Boolean = {
    excludedPackages.exists(_.r.findFirstIn(className).isDefined)
  }
}
