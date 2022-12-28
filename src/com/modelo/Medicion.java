package com.modelo;

import javax.swing.JOptionPane;

public class Medicion {
	public void pesoDolar(float valor) {
		JOptionPane.showMessageDialog(null, String.format("El valor $%.2f en pesos es $%.2f en dolares",
				valor,
				valor * 0.0057));
	}
	public void dolarPeso(float valor) {
		JOptionPane.showMessageDialog(null, String.format("El valor $%.2f en dolares es $%.2f en pesos",
				valor,
				valor * 176.06));
	}
	
	public void celsiusFahrenheit(float valor) {
		JOptionPane.showMessageDialog(null, String.format("El valor %.2f en celcius es %.2f en fahrenheit",
				valor,
				(valor * 1.8) + 32));
	}
	public void celsiusKelvin(float valor) {
		JOptionPane.showMessageDialog(null, String.format("El valor %.2f en celcius es %.2f en kelvin",
				valor,
				valor + 273.15));
	}
	public void fahrenheitCelsius(float valor) {
		JOptionPane.showMessageDialog(null, String.format("El valor %.2f en fahrenheit es %.2f en celcius",
				valor,
				(valor - 32) * 0.555555));
	}
	public void fahrenheitKelvin(float valor) {
		JOptionPane.showMessageDialog(null, String.format("El valor %.2f en fahrenheit es %.2f en kelvin",
				valor,
				(valor - 32) * 0.555555 + 273.15));
	}
	public void kelvinFahrenheit(float valor) {
		JOptionPane.showMessageDialog(null, String.format("El valor %.2f en kelvin es %.2f en fahrenheit",
				valor,
				(valor - 273.15) * 1.8 + 32));
	}
	public void kelvinCelsius(float valor) {
		JOptionPane.showMessageDialog(null, String.format("El valor %.2f en kelvin es %.2f en celcius",
				valor,
				valor - 273.15));
	}
}
