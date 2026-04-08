package com.luizbarros.java_docker_carbon_footprint.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luizbarros.java_docker_carbon_footprint.dto.ComparisonDTO;
import com.luizbarros.java_docker_carbon_footprint.entities.Medicao;
import com.luizbarros.java_docker_carbon_footprint.repositories.MedicaoRepository;
import com.luizbarros.java_docker_carbon_footprint.services.CalculadoraService;

@Controller
@RequestMapping("/dashboard")
public class CarbonController {

    private final MedicaoRepository medicaoRepository;
    private final CalculadoraService calculadoraService;
    
    public CarbonController(MedicaoRepository medicaoRepository, CalculadoraService calculadoraService) {
        this.medicaoRepository = medicaoRepository;
        this.calculadoraService = calculadoraService;
    }

    @GetMapping
    public String exibirDashboard(Model model) {
        
        List<Medicao> medicoes = medicaoRepository.findAll();
       
        ComparisonDTO relatorio = calculadoraService.gerarRelatorioGeral(medicoes);
       
        model.addAttribute("relatorio", relatorio);
        model.addAttribute("medicoes", medicoes);
        
        return "dashboard";
    }
}