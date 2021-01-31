package augusto.batchprocessing;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class ProcessadorPessoa implements ItemProcessor<Pessoa, Pessoa> {

    private static final Logger log = LoggerFactory.getLogger(ProcessadorPessoa.class);

    @Override
    public Pessoa process(Pessoa pessoa) throws Exception {
        System.out.println("processador de pessoa dentro ");
        final String nome = pessoa.getNome().toUpperCase();
        final String sobrenome = pessoa.getSobrenome().toUpperCase();

        final Pessoa transformedPessoa = new Pessoa(nome, sobrenome);

        log.info("convertendo "+pessoa+ " em "+transformedPessoa);

        return transformedPessoa;
    }
}
