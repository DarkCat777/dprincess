package edu.darkcat.dprincess.model.entity

import org.springframework.data.jpa.domain.AbstractAuditable
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "purcharse_order_header")
class PurchaseOrderHeaderEntity(
    @ManyToOne
    var client: ClientEntity,
    var deliveryDate: LocalDate,
    @OneToMany(cascade = [CascadeType.ALL])
    var purcharseOrderDetails: Set<PurchaseOrderDetailEntity>
    //Costo total
) : AbstractAuditable<UserEntity, Long>()