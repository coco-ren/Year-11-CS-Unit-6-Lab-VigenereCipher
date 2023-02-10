public class VigenereCipher {

    //properties

    private String key;

    private String alphabet;



    //constructors

    public VigenereCipher(String userKey){

        key = userKey.toLowerCase();

        alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    }



    //methods

    public String getKey() {

        return key;

    }

    public void setKey(String key) {

        this.key = key;

    }

    public String getAlphabet() {

        return alphabet;

    }

    public String encode(String userEncode){

        String encryptedWord = "";



        for (int i = 0, j = 0; i < userEncode.length(); i++)

        {

            char ofWord = userEncode.charAt(i);

            if (alphabet.indexOf(ofWord)==-1){

                encryptedWord += ofWord;
            }

            else if (alphabet.indexOf(ofWord) > -1){
                encryptedWord += (char) ((ofWord + key.charAt(j) - 2 * 'a') % 26 + 'a');
            }

            j = ++j % key.length();

        }
        return encryptedWord;

    }



    public String decode(String userDecode){

        String decryptedWord = "";

        for (int i = 0, j = 0; i < userDecode.length(); i++) {

            char ofWord = userDecode.charAt(i);

            if (alphabet.indexOf(ofWord)==-1){

                decryptedWord+= ofWord;
            }

            else if (alphabet.indexOf(ofWord)>-1)

                decryptedWord += (char) ((ofWord - key.charAt(j) + 26) % 26 + 'a');
                j = ++j % key.length();
                System.out.println(decryptedWord);


        }
        return decryptedWord;

        }

    }

