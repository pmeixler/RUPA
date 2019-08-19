package models

import java.util.Date

case class ParticipantEstimate(
                   // plan.ID: long,
                   // participant.ID: long,
                   id: Long,
                   CalculationDate: Date,
                   paymentType: String,
                   paymentForm: String,
                   paymentAmount: String,
                   beneficiaryAmount: String,
                   futureStartDate: Date
                 )

object ParticipantEstimate {
//  implicit val participantStatusFormat = Json.format[ParticipantStatus]
}
