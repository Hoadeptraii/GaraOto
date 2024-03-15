/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ramdom;

import java.security.SecureRandom;

/**
 *
 * @author HOANG SANG
 */
public class ramdom {
    private static final String CHARACTERS = "0123456789";
    private static final int CODE_LENGTH = 5;

    public static String generateRandom() {
        StringBuilder sb = new StringBuilder(CODE_LENGTH);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < CODE_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        String randomCode = sb.toString();
        System.out.println("Mã của bạn là: " + randomCode);
        return sb.toString();
    }

    public static void main(String[] args) {
        String randomCode = generateRandom();
       
    }
    
}
