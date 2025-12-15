package modulos;

public abstract class Usuario {
    protected String nombre;
    protected String correo;
    protected String tipoUsuario;

    public Usuario() {
        this.nombre = "";
        this.correo = "";
        this.tipoUsuario = "";
    }

    public Usuario(String nombre, String correo, String tipoUsuario) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no debe estar vacío.");
        }
        if (nombre.trim().length() < 5) {
            throw new IllegalArgumentException("El nombre debe contener al menos 5 caracteres.");
        }
        if (correo == null || !correo.contains(".") || !correo.endsWith(".com")) {
            throw new IllegalArgumentException("El formato del correo es inválido. Debe contener '.' y terminar en '.com'.");
        }

        this.nombre = nombre.trim();
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
    }

    public abstract void mostrarMenu();

    @Override
    public String toString() {
        return nombre + " (" + correo + ") - " + tipoUsuario;
    }
}