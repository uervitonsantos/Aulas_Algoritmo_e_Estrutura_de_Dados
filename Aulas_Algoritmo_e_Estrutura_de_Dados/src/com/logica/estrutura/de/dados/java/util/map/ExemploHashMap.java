package com.logica.estrutura.de.dados.java.util.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {

		Map<String, Double> temperaturaEstado = new HashMap<>();

		temperaturaEstado.put("Acre (AC) ", 27.4);
		temperaturaEstado.put("Alagoas (AL) ", 27.2);
		temperaturaEstado.put("Amapá (AP) ", 27.2);
		temperaturaEstado.put("Amazonas (AM) ", 27.2);
		temperaturaEstado.put("Bahia (BA) ", 27.2);
		temperaturaEstado.put("Ceará (CE) ", 27.2);
		temperaturaEstado.put("Distrito Federal (DF) ", 27.2);
		temperaturaEstado.put("Espírito Santo (ES) ", 27.2);
		temperaturaEstado.put("Goiás (GO) ", 27.2);
		temperaturaEstado.put("Maranhão (MA) ", 27.2);
		temperaturaEstado.put("Mato Grosso (MT) ", 27.2);
		temperaturaEstado.put("Mato Grosso do Sul (MS) ", 27.2);
		temperaturaEstado.put("Minas Gerais (MG) ", 27.2);
		temperaturaEstado.put("Pará (PA) ", 27.2);
		temperaturaEstado.put("Paraíba (PB) ", 27.2);
		temperaturaEstado.put("Paraná (PR) ", 27.2);
		temperaturaEstado.put("Pernambuco (PE) ", 27.2);
		temperaturaEstado.put("Piauí (PI) ", 27.2);
		temperaturaEstado.put("Rio de Janeiro (RJ) ", 27.2);
		temperaturaEstado.put("Rio Grande do Norte (RN) ", 27.4);
		temperaturaEstado.put("Rio Grande do Sul (RS) ", 27.4);
		temperaturaEstado.put("Rondônia (RO) ", 27.4);
		temperaturaEstado.put("Roraima (RR) ", 27.4);
		temperaturaEstado.put("Santa Catarina (SC) ", 27.4);
		temperaturaEstado.put("São Paulo (SP) ", 27.4);
		temperaturaEstado.put("Sergipe (SE) ", 27.4);
		temperaturaEstado.put("Tocantins (TO) ", 27.4);

		System.out.println(temperaturaEstado);
		
		System.out.println("NUMERO DE ESTADOS: " + temperaturaEstado.size());

		System.out.println(temperaturaEstado.get("Piauí (PI) "));

		System.out.println(temperaturaEstado.containsKey("Mato Grosso (MT) "));

		for (Map.Entry<String, Double> entry : temperaturaEstado.entrySet()) {
			System.out.println(entry.getKey() + "--- " + entry.getValue());
		}

	}
}
