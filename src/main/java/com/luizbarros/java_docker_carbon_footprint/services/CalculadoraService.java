package com.luizbarros.java_docker_carbon_footprint.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luizbarros.java_docker_carbon_footprint.dto.ComparisonDTO;
import com.luizbarros.java_docker_carbon_footprint.entities.Medicao;
import com.luizbarros.java_docker_carbon_footprint.entities.enums.TipoFase;

@Service
public class CalculadoraService {

    public ComparisonDTO gerarRelatorioGeral(List<Medicao> todasMedicoes) {
        
        //Somas para a fase PRE_PALESTRA
        double kmPre = somarPorFase(todasMedicoes, TipoFase.PRE_PALESTRA, Medicao::getKmRodados);
        double kwhPre = somarPorFase(todasMedicoes, TipoFase.PRE_PALESTRA, Medicao::getKwhConsumido);
        double co2Pre = somarPorFase(todasMedicoes, TipoFase.PRE_PALESTRA, Medicao::getTotalCo2);

        //Somas para a fase POS_PALESTRA
        double kmPos = somarPorFase(todasMedicoes, TipoFase.POS_PALESTRA, Medicao::getKmRodados);
        double kwhPos = somarPorFase(todasMedicoes, TipoFase.POS_PALESTRA, Medicao::getKwhConsumido);
        double co2Pos = somarPorFase(todasMedicoes, TipoFase.POS_PALESTRA, Medicao::getTotalCo2);
        
        return new ComparisonDTO(co2Pre, co2Pos, kmPre, kmPos, kwhPre, kwhPos);
    }
    
    private double somarPorFase(List<Medicao> lista, TipoFase fase, java.util.function.ToDoubleFunction<Medicao> mapper) {
        return lista.stream()
                .filter(m -> m.getTipo() == fase)
                .mapToDouble(mapper)
                .sum();
    }
}
