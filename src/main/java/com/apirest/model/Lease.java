package com.apirest.model;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDocumento_identificacion_arrendatario() {
        return documento_identificacion_arrendatario;
    }

    public void setDocumento_identificacion_arrendatario(int documento_identificacion_arrendatario) {
        this.documento_identificacion_arrendatario = documento_identificacion_arrendatario;
    }

    public int getCodigo_inmueble() {
        return codigo_inmueble;
    }

    public void setCodigo_inmueble(int codigo_inmueble) {
        this.codigo_inmueble = codigo_inmueble;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int getValor_pagado() {
        return valor_pagado;
    }

    public void setValor_pagado(int valor_pagado) {
        this.valor_pagado = valor_pagado;
    }
}