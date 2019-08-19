package models

import java.util.Date

case class ParticipantPayment(
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

object ParticipantPayment {
//  implicit val participantStatusFormat = Json.format[ParticipantStatus]
}
