package pt.ufp.lpi.lectures.controller.dto;

import javax.persistence.*;

public class UtilizadorDTO
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private float orcamentoLimite;



}