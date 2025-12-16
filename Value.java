/**
 * Representa un valor genérico utilizado por el intérprete del lenguaje PLATA.
 *
 * <p>
 * Esta clase actúa como un contenedor dinámico que puede almacenar distintos
 * tipos de datos (como {@code Double}, {@code Boolean}, {@code String}, etc.).
 * El objetivo es permitir que todas las expresiones del visitor devuelvan el
 * mismo tipo de objeto, facilitando la evaluación homogénea del programa.
 * </p>
 *
 * <p>
 * La clase proporciona métodos de conversión como {@link #asDouble()},
 * {@link #asBoolean()} y {@link #asString()}, que permiten recuperar el valor
 * interno en el tipo esperado. Si se intenta convertir a un tipo incompatible,
 * se lanzará una {@link ClassCastException}.
 * </p>
 *
 * <p>
 * También incluye un valor especial {@link #VOID} utilizado para representar
 * expresiones o sentencias que no devuelven un valor significativo (similar al
 * tipo {@code void} en Java).
 * </p>
 */

public class Value {

    public static Value VOID = new Value(new Object());

    final Object value;
    
    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Double asDouble() {
        return (Double)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}