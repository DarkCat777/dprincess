package edu.darkcat.dprincess.model.entity

import org.springframework.data.jpa.domain.AbstractAuditable
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table

@Entity
@Table(name = "purchase_order_detail")
class PurchaseOrderDetailEntity(
    @ManyToOne(optional = false)
    @PrimaryKeyJoinColumn(name = "purchase_order_header_fpk")
    var purcharseOrderHeader: PurchaseOrderHeaderEntity,
    // Unidad de medida (pie,Par, docena, ciento, millar, etc.)
    // Cantidad (Numero [10] pares, [10] docenas, etc)
    // Importe (Sub-total) (Costo numero)
    // Moneda (Sub-total) (Soles, Bolivares)
    // Tipo de cambio (Sub-total) (Soles = [x => Numero]  * Bolivares)
    // Modelo del calzado
    // -- Nombre
    // -- Codigo
    // -- Fotos (N fotos en la nube)
    // -- C/U (Costo unitario minorista) *****
    // -- C/U (Costo unitario mayorista) *****
    // -- tipo de calzado (Botas, Zapatillas, zapatos)
    // material del calzado (Puro cuero, mixto, sintetico)
    // color del calzado (Negro, caramelo, marron)
    // material de la suela (TR, Spanson, Caucho)
) : AbstractAuditable<UserEntity, Long>()