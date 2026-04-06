package com.luizbarros.java_docker_carbon_footprint.dto;

public record ComparisonDTO(
	    Double totalCo2Pre,
	    Double totalCo2Pos,
	    Double kmTotalPre,
	    Double kmTotalPos,
	    Double kwhTotalPre,
	    Double kwhTotalPos
	) {
	   
	    public Double getDiferencaAbsoluta() {
	        return totalCo2Pre - totalCo2Pos;
	    }
	    
	    public Double getPercentualReducao() {
	        if (totalCo2Pre == 0) return 0.0;
	        return (getDiferencaAbsoluta() / totalCo2Pre) * 100;
	    }
	}
