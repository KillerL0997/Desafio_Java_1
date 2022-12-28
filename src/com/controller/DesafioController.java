package com.controller;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.modelo.Medicion;

public class DesafioController extends JFrame {
	private static final long serialVersionUID = 1L;
	private Medicion medicion;

	public DesafioController() {
		super("Conversor");
		Container container = getContentPane();
        setLayout(null);
        medicion = new Medicion();
        int val;
        do {        	
        	val = crearMenu(container);
        }while(val == 0);
	}
	public String opcElegida(Object[] obj) {
		try {			
			var opc = JOptionPane.showInputDialog(null,
					"Seleccione el tipo de convercion",
					"Conversor",
					JOptionPane.NO_OPTION,
					null,
					obj,
					obj[0]);
			return opc.toString();
		} catch(NullPointerException e) {
			return "";
		}
	}
	public String resuConvertir(String dialogo) {
		try {			
			var resu =  JOptionPane.showInputDialog(null,
					dialogo,
					"Conversor",
					JOptionPane.NO_OPTION);
			return resu.toString();
		}catch(NullPointerException e) {
			return "";
		}
	}
	private int crearMenu(Container container) {
		Object[] obj = {"Moneda","Temperatura"};
		var opc = JOptionPane.showInputDialog(null,
				"Seleccione el tipo de medicion",
				"Conversor",
				JOptionPane.NO_OPTION,
				null,
				obj,
				obj[0]);
		if(opc == "Moneda")
			return conversorMoneda();
		if(opc == "Temperatura")
			return conversorTemperatura();
		return 1;
	}
	private int conversorTemperatura() {
		Object[] obj = {"De celsius a fahrenheit",
				"De celsius a kelvin",
				"De fahrenheit a celsius",
				"De fahrenheit a kelvin",
				"De kelvin a fahrenheit",
				"De kelvin a celsius"};
		int resufinal = 0;
		var opc = opcElegida(obj);
		if(opc != "") {			
			var resu = resuConvertir("Ingrese el valor:");
			if(resu != "") {				
				try{			
					switch(opc) {
					case "De celsius a fahrenheit":
						medicion.celsiusFahrenheit(Float.parseFloat(resu));
						break;
					case "De celsius a kelvin":
						medicion.celsiusKelvin(Float.parseFloat(resu));
						break;
					case "De fahrenheit a celsius":
						medicion.fahrenheitCelsius(Float.parseFloat(resu));
						break;
					case "De fahrenheit a kelvin":
						medicion.fahrenheitKelvin(Float.parseFloat(resu));
						break;
					case "De kelvin a fahrenheit":
						medicion.kelvinFahrenheit(Float.parseFloat(resu));
						break;
					case "De kelvin a celsius":
						medicion.kelvinCelsius(Float.parseFloat(resu));
						break;
					}
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "Solo se permiten valores numericos");
				}
				resufinal = JOptionPane.showConfirmDialog(null, "Desea continuar");
				if(resufinal != 0)
					JOptionPane.showMessageDialog(null, "Programa terminado");
			}
		}
		return resufinal;
	}

	private int conversorMoneda() {
		Object[] obj = {"De peso a dolar","De dolar a peso"};
		int resufinal = 0;
		var opc = opcElegida(obj);
		if(opc != "") {			
			var resu = resuConvertir("Ingrese el monto:");
			if(resu != "") {				
				try{			
					switch(opc) {
					case "De peso a dolar":
						medicion.pesoDolar(Float.parseFloat(resu));
						break;
					case "De dolar a peso":
						medicion.dolarPeso(Float.parseFloat(resu));
						break;
					}
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "Solo se permiten valores numericos");
				}
				resufinal = JOptionPane.showConfirmDialog(null, "Desea continuar");
				if(resufinal != 0)
					JOptionPane.showMessageDialog(null, "Programa terminado");
			}
		}
		return resufinal;
	}
}
