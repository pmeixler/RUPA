package models

import java.util.Date

case class PlanProvision(
                   // plan.ID: long,
                   id: Long,
                   effectiveStartDate: Date,
                   effectiveEndDate: Date,
                   provisionNum: String,
                   note: String
                 )

object PlanProvision {
//  implicit val planProvisionsFormat = Json.format[PlanProvisions]
}
