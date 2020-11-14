package com.apirest.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity // que es un modelo de mysql
@Table(name = "leases") // darle estructura
public class Lease { // defiendo clase
    @Id
    @GeneratedValue 
    private Long id;

    @NotBlank
        private int documento_identificacion_arrendatario;

    @NotBlank
        private int codigo_inmueble;    
        
    @NotBlank
        private String fecha_pago;
        
    @NotBlank
        private int valor_pagado;

    public Lease() {
        super();
    }

    public Lease(
        Long id, 
        int documento_identificacion_arrendatario, 
        int codigo_inmueble, 
        String fecha_pago, 
        int valor_pagado
    ) {
        super();

        this.id = id;
        this.documento_identificacion_arrendatario = documento_identificacion_arrendatario;
        this.codigo_inmueble = codigo_inmueble;
        this.fecha_pago = fecha_pago;
        this.valor_pagado = valor_pagado;
    }
}