public class BraceChecker {

    public boolean isValid(String braces) {
        char lastBrace = braces.charAt(0);

        if(lastBrace == ')' || lastBrace == '}' || lastBrace == ']' ) {
            return false;
        }

        for(int i = 1; i < braces.length(); i++) {
            System.out.println(lastBrace);

            switch(lastBrace) {
                case '[':
                    if(braces.charAt(i) == '}' || braces.charAt(i) == ')') {
                        return false;
                    }
                    break;
                case '(':
                    if(braces.charAt(i) == ']' || braces.charAt(i) == '}') {
                        return false;
                    }
                    break;
                case '{':
                    if(braces.charAt(i) == ']' || braces.charAt(i) == ')') {
                        return false;
                    }
                    break;
            }

            lastBrace = braces.charAt(i);
        }

        return lastBrace != '(' && lastBrace != '{' && lastBrace != '[';
    }

}