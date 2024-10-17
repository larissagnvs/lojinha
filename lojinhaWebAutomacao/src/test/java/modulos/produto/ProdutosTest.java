package modulos.produto;


import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.log.Log;
import paginas.LoginPage;

import java.time.Duration;

@DisplayName("Testes Web do Modulo de Produto")
public class ProdutosTest {

    private WebDriver navegador;

    @BeforeEach
        public void beforeEach() {
        // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome-win64\\chromedriver.exe");
        this.navegador = new ChromeDriver();


        // Vou maximizar a tela
        this.navegador.manage().window().maximize();


        // Vou definir um tempo de espera padrão de 5 segundos
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        // Navegar para a página da Lojinha Web
        this.navegador.get("http://165.227.93.41/lojinha-web/v2/");

    }

    @DisplayName("Nao e permitido registrar um produto com valor igual a zero")
    @Test
    public void testNaoEPermitidoRegistrarProdutoComValorIgualAZero() {
        String mensagemApresentada = new LoginPage(navegador)
                .informarOUsuario("larissapastor")
                .informarASenha("011216")
                .submeterFormularioDeLogin()
                .acessarFormularioAdicaoNovoProduto()
                .informarNomeDoProduto("Mackbook Pro")
                .informarValorDoProduto("000")
                .informarCoresDoProduto("preto, branco")
                .submeterFormularioDeAdicaoComErro()
                .capturarMensagemApresentada();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);

    }

    @Test
    @DisplayName("Nao e permitido registrar um produto com valor acima de 7.000,00")
    public void testNaoEPermitidoRegistrarProdutoAcimaDeSeteMil() {
        String mensagemApresentada = new LoginPage(navegador)
                .informarOUsuario("larissapastor")
                .informarASenha("011216")
                .submeterFormularioDeLogin()
                .acessarFormularioAdicaoNovoProduto()
                .informarNomeDoProduto("Mackbook Pro")
                .informarValorDoProduto("700001")
                .informarCoresDoProduto("preto, branco")
                .submeterFormularioDeAdicaoComErro()
                .capturarMensagemApresentada();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);
    }

    @Test
    @DisplayName("Posso adicionar produtos que estejam no limite de 0,01 e 7.000,01")
    public void testPossoAdicionarProdutoComValorDeUmCentavoASeteMilReais() {
        String mensagemApresentada = new LoginPage(navegador)
                .informarOUsuario("larissapastor")
                .informarASenha("011216")
                .submeterFormularioDeLogin()
                .acessarFormularioAdicaoNovoProduto()
                .informarNomeDoProduto("Mackbook Pro")
                .informarValorDoProduto("300000")
                .informarCoresDoProduto("preto, branco")
                .submeterFormularioDeAdicaoComSucesso()
                .capturarMensagemApresentada();

        Assertions.assertEquals("Produto adicionado com sucesso", mensagemApresentada);
    }

    @Test
    @DisplayName("Posso adicionar produto no valor de 7.000,00")
    public void testPossoAdicionarProdutoComValorDeSeteMilReais() {
        String mensagemApresentada = new LoginPage(navegador)
                .informarOUsuario("larissapastor")
                .informarASenha("011216")
                .submeterFormularioDeLogin()
                .acessarFormularioAdicaoNovoProduto()
                .informarNomeDoProduto("Mackbook Pro")
                .informarValorDoProduto("700000")
                .informarCoresDoProduto("preto, branco")
                .submeterFormularioDeAdicaoComSucesso()
                .capturarMensagemApresentada();

        Assertions.assertEquals("Produto adicionado com sucesso", mensagemApresentada);
    }

    @Test
    @DisplayName("Posso adicionar produto no valor de 0,01")
    public void testPossoAdicionarProdutoComValorDeUmCentavo() {
        String mensagemApresentada = new LoginPage(navegador)
                .informarOUsuario("larissapastor")
                .informarASenha("011216")
                .submeterFormularioDeLogin()
                .acessarFormularioAdicaoNovoProduto()
                .informarNomeDoProduto("Mackbook Pro")
                .informarValorDoProduto("001")
                .informarCoresDoProd
        Assertions.assertEquals(uto("preto, branco")
                .submeterFormularioDeAdicaoComSucesso()
                .capturarMensagemApresentada();
"Produto adicionado com sucesso", mensagemApresentada);
    }

    @AfterEach
    public void afterEach() {
    // Vou fechar o navegador
    navegador.quit();
    }
}
