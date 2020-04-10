package lucasgenovez.lucasgenovez.organizze.helper;

import com.whatever-domain.BCrypt

public class BCrypt {


    private String generateHashedPass(String pass) {
        // hash a plaintext password using the typical log rounds (10)
        return BCrypt.hashpw(pass, BCrypt.gensalt());
    }

    private boolean isValid(String clearTextPassword, String hashedPass) {
        // returns true if password matches hash
        return BCrypt.checkpw(clearTextPassword, hashedPass);
    }
}
