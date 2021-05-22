package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.DatosIMC;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service("ServicioCalcularIMC")
@Transactional

public class ServicioIMCImpl implements ServicioCalcularIMC {

    @Override
    public DatosIMC calcularImcCompleto(Double altura, Double peso) {

        Double IMC;
        String compCorporal = "";

        if (validarAltura(altura).equals(false)){
            throw new AlturaInvalida();
        }
        if (validarPeso(peso).equals(false)){
            throw new PesoInvalido();
        }

        IMC = peso / (altura*altura);
        if(IMC < 18.5){
            compCorporal = "Bajo peso";
        }else if(IMC <= 18.5 && IMC <= 24.9){
            compCorporal = "Normal";
        }else if(IMC <= 25.0 && IMC <= 29.9){
            compCorporal = "Sobrepeso";
        }else if(IMC >= 30.0){
            compCorporal = "Obeso";
        }

        return new DatosIMC(altura,peso,IMC,compCorporal);
    }
    @Override
    public Boolean validarAltura(Double altura) {
        if(altura > 1.50 && altura < 2.80){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public Boolean validarPeso(Double peso) {
        if(peso > 20.0 && peso < 640.0){
            return true;
        }else{
            return false;
        }
    }
}