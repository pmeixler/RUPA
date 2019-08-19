package models

import java.util.Date

case class PlanService(
                   // plan.ID: long,
                   id: Long,
                   effectiveStartDate: Date,
                   effectiveEndDate: Date,
                   planCount: String,
                   lineOfBusiness: String,
                   segment: String,
                   dbActuarial: String,
                   dbAdministration: String,
                   dbPensionRiskServices: String
                 )

object PlanService {
//  implicit val planServicesFormat = Json.format[PlanServices]
}
