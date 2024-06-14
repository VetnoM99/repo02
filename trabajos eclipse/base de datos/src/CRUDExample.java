import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDExample {

    // Método para crear un nuevo registro en la base de datos
    public void crearRegistro(Scanner scanner) {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left over

        String sql = "INSERT INTO tabla_ejemplo (nombre, edad) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "admin");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setInt(2, edad);
            pstmt.executeUpdate();
            System.out.println("Registro creado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    // Método para leer registros de la base de datos
    public void leerRegistros() {
        String sql = "SELECT * FROM tabla_ejemplo";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "admin");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }
        } catch (SQLException e) {
            System.out.println("Error al leer los registros: " + e.getMessage());
        }
    }

    // Método para actualizar un registro en la base de datos
    public void actualizarRegistro(Scanner scanner) {
        System.out.print("Ingrese el nombre del registro que desea actualizar: ");
        String nombreAnterior = scanner.nextLine();
        System.out.print("Ingrese el nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();

        String sql = "UPDATE tabla_ejemplo SET nombre = ? WHERE nombre = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "admin");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nuevoNombre);
            pstmt.setString(2, nombreAnterior);
            pstmt.executeUpdate();
            System.out.println("Registro actualizado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

    // Método para eliminar un registro de la base de datos
    public void eliminarRegistro(Scanner scanner) {
        System.out.print("Ingrese el nombre del registro que desea eliminar: ");
        String nombre = scanner.nextLine();

        String sql = "DELETE FROM tabla_ejemplo WHERE nombre = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "admin");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.executeUpdate();
            System.out.println("Registro eliminado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CRUDExample crudExample = new CRUDExample();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left over

            switch (opcion) {
                case 1:
                    crudExample.crearRegistro(scanner);
                    break;
                case 2:
                    crudExample.leerRegistros();
                    break;
                case 3:
                    crudExample.actualizarRegistro(scanner);
                    break;
                case 4:
                    crudExample.eliminarRegistro(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }
}
