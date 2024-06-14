package com.edgar.test.entity;

import jakarta.persistence.*;

/**
 * entidad que mapea a la tabla persona,
 * tiene 3 campos Id, nombre y edad.
 */
@Entity (name = "persona")
public class Persona {
    /**
     * llave primaria de la tabla persona,
     * usa la secuencia persona_id_seq
     * para autogenerar el numero identificador
     */
    @Id
    @SequenceGenerator(name = "persona_seq", sequenceName = "persona_id_seq", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "persona_seq")
    private int id;
    @Column
    private String nombre;
    @Column
    private int edad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
