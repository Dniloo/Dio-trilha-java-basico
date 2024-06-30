public class FormatadorCepExemplo {
    
    static String formatarCep(String cep) throws CepInvalidoException{

       if (cep.length() != 8 ) 
        throw new CepInvalidoException();
            //simular CEP formatado
        return "23.765-064";
        
    }
}
