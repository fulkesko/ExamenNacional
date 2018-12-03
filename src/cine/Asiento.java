package cine;

import java.util.Objects;

public class Asiento {
    private int numero;
    private String letra;
    private boolean ocupado;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.numero;
        hash = 53 * hash + Objects.hashCode(this.letra);
        hash = 53 * hash + (this.ocupado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asiento other = (Asiento) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.ocupado != other.ocupado) {
            return false;
        }
        if (!Objects.equals(this.letra, other.letra)) {
            return false;
        }
        return true;
    }
    
           
}
