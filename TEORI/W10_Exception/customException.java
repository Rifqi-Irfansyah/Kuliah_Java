public class customException {
    public static void main(String[] args) {
        String password = "ab";
        try {
            if (!"Rifqi".equals(password) ) 
                throw new InvalidPasswordException("Password Salah");
            else
                System.out.println("Password Benar");
        } catch (InvalidPasswordException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
        
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
