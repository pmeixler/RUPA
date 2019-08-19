package models

import java.util.Date

case class EmployerContract(
                   // plan.ID: long,
                   id: Long,
                   effectiveStartDate: Date,
                   effectiveEndDate: Date,
                   provisionNum: String,
                   note: String
                 )

object EmployerContract {
//  implicit val planProvisionsFormat = Json.format[PlanProvisions]
}
