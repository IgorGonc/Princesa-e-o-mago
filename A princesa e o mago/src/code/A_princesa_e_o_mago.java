package code;
import java.util.Scanner;

public class A_princesa_e_o_mago {
	
// Método para efeito para slow no textos
	private static void printWithDelay(String text) throws InterruptedException{
		for (char c : text.toCharArray()) {
			System.out.print(c);
			Thread.sleep(20);
		}
		System.out.println();
	}

	
// Método para batalhar junto com a fada
	public static void batalhaFada(String nome)throws InterruptedException {
		Scanner ent = new Scanner(System.in);
		
		printWithDelay("\n\nVocê segue seu caminho para a caverna do dragão e finalmente chega.\n\n");
		
		printWithDelay( nome+": Lá está a princesa, preciso dar um jeito de ajudá-la.");
		
		int opc_Gaio;
		
		do {
			printWithDelay("\nOpção 1: ir abrir a gaiola\nOpção 2: não abrir a gaiola");
			opc_Gaio=ent.nextInt();
			
			switch(opc_Gaio) {
			case 1:
				opc_Gaio = 1;
				printWithDelay("Com sua magia, você conseguiu abrir a gaiola e libertar a princesa.\n"
						+ "Mas o dragão não ficou feliz com sua presença.\n\n");
				
				printWithDelay("Dragão: Você não pode me vencer, mago!\n"
						+ nome+": Ah, eu não sei sobre isso - responde erguendo o cajado - Mas tenho certeza\n"
						+ "de que posso tentar.\n\n");
				
				printWithDelay("Usando sua magia, você consegue criar um escudo protetor ao seu redor\n"
						+ "enquanto lutava contra o dragão. Mas suas chamas eram poderosas, e você precisava\n"
						+ "de ajuda.\n\n");
				
				printWithDelay("Foi então que a princesa apareceu ao meu lado, segurando uma espada.\n\n");
				
				printWithDelay(nome+": ON-ONDE VOCÊ ACHOU ESSA ESPADA?\n"
						+ "Princesa: Eu quero lutar do seu lado mago\n\n");
		
				int opc_SairouNao;
				do {
					printWithDelay("Opção 1: mandar ela sair\nOpção 2: deixar ela ficar");
					opc_SairouNao=ent.nextInt();
					
					switch(opc_SairouNao) {
					case 1:
						opc_SairouNao = 1;
						printWithDelay(nome+": Não, princesa, é perigoso demais\n"
								+ "Princesa: Eu não posso ficar aqui e assistir você lutar sozinho.\n"
								+ "Por favor, deixe-me ajudar\n\n");
						break;
					case 2: 
						opc_SairouNao = 2;
						printWithDelay(nome+": Ok, princesa, mas é perigoso demais, fique atenta, eu não quero te perder.\n"
								+ "Princesa: Pode deixar! Vamos derrotar esse dragão juntos e viveremos felizes para sempre\n");
						break;
					default:
						opc_SairouNao = 3;
						printWithDelay("Faça uma escolha válida\n");
					}
				}while(opc_SairouNao >= 3|| opc_SairouNao < 1);
			case 2:
				opc_Gaio = 2;
				printWithDelay("Vocês sabiam que não havia tempo a perder. Então, juntos, lutamos contra o dragão.\n"
						+ "Com a magia do mago e a força da espada da princesa, vocês conseguiram derrotar o dragão.\n\n");
				
				printWithDelay(nome+": Você é realmente muito corajosa, princesa.\n"
						+ "Princesa: Agradeço-lhe, mago, por salvar minha vida.\n"
						+ nome+": Eu não poderia deixar você sozinha nas mãos daquele dragão. Mas agora,\n"
						+ "temos que ir embora daqui antes que outros inimigos apareçam.\n\n");
				
				printWithDelay("Assim, ajudamos a princesa a voltar para seu reino, onde ela foi recebida\n"
						+ "com festa e celebração. Eu sabia que nunca esqueceria a luta que travamos juntos\n"
						+ "contra o dragão e o vínculo que criamos por causa disso.");
			break;
			default: 
				opc_Gaio = 3;
				printWithDelay("Faça uma escolha válida\n");
			}
		}while(opc_Gaio >= 3||opc_Gaio < 1);
		
	}
	
// Método para batalhar contra o dragão
	public static void batalhaDemon(String nome) throws InterruptedException{
		Scanner ent = new Scanner(System.in);
		
		printWithDelay("\n\nVocê segue seu caminho para a caverna do dragão e finalmente chega.\n\n");
		
		printWithDelay(nome+": Lá está a princesa, preciso dar um jeito de ajudá-la.");
		
		int opc_Gaio;
		do {
			printWithDelay("\nOpção 1: ir abrir a gaiola\nOpção 2: não abrir a gaiola");
			opc_Gaio=ent.nextInt();
			
			switch(opc_Gaio) {
			case 1:
				opc_Gaio = 1;
				printWithDelay("Com sua magia, você conseguiu abrir a gaiola e libertar a princesa.\n"
						+ "Mas o dragão não ficou feliz com sua presença.\n\n");
				
				printWithDelay("Dragão: Você não pode me vencer, mago!\n"
						+ nome+": Ah, eu não sei sobre isso - responde erguendo o cajado - Mas tenho certeza\n"
						+ "de que posso tentar.\n\n");
				
				printWithDelay("Usando sua magia, você consegue criar um escudo protetor ao seu redor\n"
						+ "enquanto lutava contra o dragão. Mas suas chamas eram poderosas, e você precisava\n"
						+ "de ajuda.\n\n");
				
				printWithDelay("Foi então que a princesa apareceu ao meu lado, segurando uma espada.\n\n");
				
				printWithDelay(nome+": CO-COMO VOCÊ SAIU DA GAIOLA?\n"
						+ "Princesa: Eu quero lutar do seu lado mago\n\n");
		
				int opc_SairouNao;
				do {
					printWithDelay("Opção 1: mandar ela sair\nOpção 2: deixar ela ficar");
					opc_SairouNao=ent.nextInt();
					
					switch(opc_SairouNao) {
					case 1:
						opc_SairouNao = 1;
						printWithDelay(nome+": Não, princesa, é perigoso demais\n"
								+ "Princesa: Eu não posso ficar aqui e assistir você lutar sozinho.\n"
								+ "Por favor, deixe-me ajudar\n\n");
						break;
					case 2: 
						opc_SairouNao = 2;
						printWithDelay(nome+": Ok, princesa, mas é perigoso demais, fique atenta, eu não quero te perder.\n"
								+ "Princesa: Pode deixar! Vamos derrotar esse dragão juntos e viveremos felizes para sempre\n");
						break;
					default:
						opc_SairouNao = 3;
						printWithDelay("Faça uma escolha válida\n");
						
					}
				}while(opc_Gaio >= 3||opc_Gaio < 1);
				
				printWithDelay("Vocês sabiam que não havia tempo a perder. Então, juntos, lutamos contra o dragão.\n"
						+ "Com a magia do mago e a força da espada da princesa, vocês conseguiram derrotar o dragão.\n\n");
				
				printWithDelay(nome+": Você é realmente muito corajosa, princesa.\n"
						+ "Princesa: Agradeço-lhe, mago, por salvar minha vida.\n"
						+ nome+": Eu não poderia deixar você sozinha nas mãos daquele dragão. Mas agora,\n"
						+ "temos que ir embora daqui antes que outros inimigos apareçam.\n\n");
				
				printWithDelay("Assim, ajudamos a princesa a voltar para seu reino, onde ela foi recebida\n"
						+ "com festa e celebração. Eu sabia que nunca esqueceria a luta que travamos juntos\n"
						+ "contra o dragão e o vínculo que criamos por causa disso.");
				break;
			case 2:
				opc_Gaio = 2;
				printWithDelay("Você decide não abrir a gaiola e lutar sozinho, pois pode ser perigoso demais\n"
						+ "para a princesa.\n");
				
				printWithDelay("O dragão te vê de longe e já começa a rugir.\n\n"
						+ "Dragão: Então você chegou, mago, eu estava ansioso te esperando.\n"
						+ "Está pronto para perder sua vida?\n"
						+ nome+": Você está brincando comigo, né? Você será derrotado e eu vou\n"
						+ "resgatar a princesa.\n\n");
				
				printWithDelay("Após muito tempo de batalha, você começou a ficar cansado e\n"
						+ "não sabia se ia aguentar muito tempo de batalha, mas parece que o\n"
						+ "dragão está se cansando também, até que...\n");
				
				printWithDelay("Dragão: Vamos, mago, é só isso que você tem?\n"
						+ "Achei que seria mais difícil, mas você é um fraco.\n");
				
				printWithDelay("O mago então acaba se desequilibrando e caindo dentro de\n"
						+ "uma vala que tinha ali próximo.\n");
				
				printWithDelay("Princesa: E AGORA? O QUE EU VOU FAZER, EU PRECISO SAIR DAQUI\n\n");
				
				printWithDelay("A princesa consegue sair da gaiola e vê a bolsa do mago caída\n"
						+ "no canto da caverna, la dentro ela encontra uma maçã e decide comer,\n"
						+ "já que ela estava fraca, mas a maçã era uma maçã amaldiçoada.\n"
						+ "Quando ela comeu algumas coisas aconteceram, um ódio e uma frieza\n"
						+ "corrompeu o coração da princesa e de repente ela sentiu uma força\n "
						+ "incontrolavel e ela conseguiu derrotar o dragão sozinha sem muito esforço.\n\n"
						+ "A princesa decide então voltar para o reino dela para destruir tudo\n"
						+ "e fazer com que todos obedeçam as maldades dela.");
				
				break;
				default:
					opc_Gaio = 3;
					printWithDelay("Faça uma escolha válida\n");
			}
		}while(opc_Gaio >= 3||opc_Gaio < 1);
	}
	
	
// Método para os caminhos durante a jornada	
	public static void caminho(String nome) throws InterruptedException{
		Scanner ent = new Scanner(System.in);
		
		A_princesa_e_o_mago comp2 = new A_princesa_e_o_mago();
		
		printWithDelay("Indo para as montanhas você percebe que existem 2 opções de caminho, a primeira opção\n"
				+ "é o caminho do bosque, que é iluminado e mais fácil, ou a segunda opção, o caminho da floresta\n"
				+ "sombria, que é escuro e pode ser que você encontre algumas criaturas místicas por lá.\n");
		
		int opc_Cam;
		do {
			printWithDelay("Escolha um dos caminhos\nOpção 1: bosque\nOpção 2: floresta sombria");
			opc_Cam=ent.nextInt();
			
			switch(opc_Cam) {
			case 1:
				opc_Cam = 1;
				printWithDelay("\nVocê escolheu o caminho do bosque, então lá vamos nós.\n\n");
				
				printWithDelay(nome+": Nossa, que lindo bosque, cheio de árvores, flores e\n"
						+ "lindos passarinhos.\n"
						+ "*fada misteriosa*: Olá, mago, o que você faz por esses lados?\n"
						+ nome+": Não sei se eu deveria te contar, eu nem sei seu nome.\n "
						+ "Azura: Meu nome é Azura, eu sou a fada protetora desse bosque.\n"
						+ nome+" pensou: *Será que eu devo confiar nessa fada?*\n");
				
				int opc_ConfiarouNao;
				printWithDelay("Opção 1: confiar\nOpção 2: não confiar.");
				opc_ConfiarouNao=ent.nextInt();
				
				switch(opc_ConfiarouNao) {
				case 1:
					printWithDelay(nome+": Me disseram que existe uma princesa aprisionada\n"
							+ "no alto das montanhas, estou indo salvar ela.\n"
							+ "Azura: Minha nossa! Eu sei o que pode te ajudar! Tome essa flor\n"
							+ nome+": E o que eu faço com essa flor?\n"
							+ "Azura: Você saberá quando usar.");
					comp2.batalhaFada(nome);
					
					printWithDelay("Você se lembra do que a fada disse sobre a flor, você pega a\n"
							+ "flor de dentro da bolsa e entrega para a princesa, ela fica muito feliz,\n"
							+ "te da um beijo muito apaixonado, e mais uma vez agradece por salvar a sua vida.");
					break;
				case 2:
					printWithDelay(nome+": Ah, eu só estou dando uma volta, quem sabe não acho umas\n"
							+ "frutas para matar a fome.\n"
							+ "Azura: Eu sei que está mentindo, eu consigo ver o seu coração. Agora me\n "
							+ "diga, aonde você está indo?\n"
							+ nome+": Me disseram que existe uma princesa aprisionada no alto das\n"
							+ "montanhas, estou indo salvar ela.\n"
							+ "Azura: Minha nossa! Eu sei o que pode te ajudar! Tome essa flor\n"
							+ nome+": E o que eu faço com essa flor?\n"
							+ "Azura: Você saberá quando usar.");
					comp2.batalhaFada(nome);
					break;
				}
				
			break;
			case 2:
				opc_Cam = 2;
				printWithDelay("Você escolheu o caminho da floresta sombria, então lá vamos nós.\n");
				
				printWithDelay(nome+": Ai que frioo. Aqui é muito escuro, espere, tem algo se mexendo\n"
						+ "nos arbustos\n"
						+ "*TsTsTs Uma criatura pula de dentro dos arbustos\n"
						+ nome+": AAAAAAaaAaaaAaaAAAA o que você é?\n"
						+ "Zabuza: Meu nome é Zabuza, eu ouvi dizer que tem uma princesa presa na\n"
						+ "caverna do dragão, você está indo pra la né?\n"
						+ nome+": Sim, é o meu dever salvar a vida dessa princesa.\n"
						+ "Zabuza: Nosfa, que corajoso hehehehe. Eu tenho um presente pra você\n"
						+ "tome essa maçã, ela é especial, acredito que vai te ajudar. HAHAHAHA\n"
						+ "*Zabuza some em meio a uma fumaça misteriosa*\n"
						+ nome+": EEEEI, Zabuza, o que eu faço com isso? Ele sumiu. Credo, que loucura.\n");
				
				printWithDelay("Você continua andando, agora com mais medo e mais frio.\n\n"
						+ nome+": ZABUZAAAAA EIIII\n"
						+ "voz estranha: Eii, me ajude.\n"
						+ nome+" pensa: *Essa voz ta vindo de trás daquela árvore*\n"
						+ nome+": Quem ta ai? Quem é você?\n"
						+ "Puck: Oi, mago, meu nome é Puck, o duende. Eu estou ferido, você pode me ajudar?\n"
						+ nome+": Claro, o que aconteceu?\n"
						+ "Puck: Eu não sei, eu estava procurando frutas para os meus filhos e fui\n"
						+ "atingido por algum raio.\n\n"
						+ "(Puck vê a maçã brilhante que Zabuza te deu)\n"
						+ "Puck: O que é isso no seu bolso?\n"
						+ nome+": Uma criatura apareceu de trás dos arbustos e me deu essa maçã,\n"
						+ "ele falou que é mágica e que poderia ajudar na minha aventura.\n"
						+ "Puck: Por favor, me dê essa maçã, ela é mágica e pode me curar.\n");
				
				int opc_DarouNao;
				do {
					printWithDelay("Opção 1: dar a maçã\nOpção 2: não dar a maçã.");
					opc_DarouNao=ent.nextInt();
					
					switch(opc_DarouNao) { 
					case 1:
						opc_DarouNao = 1;
						printWithDelay(nome+" pensou: *Mas o Zabuza disse que eu poderia precisar*\n"
								+ "Puck: Eu sei que você não me conhece mas quando eu estiver curado\n"
								+ "eu posso te ajudar com tudo que você precisar. Olhe, eu moro aqui\n"
								+ "perto, eu posso te levar lá para matar a fome.\n"
								+ nome+": Ok, aqui está, eu sei que você precisa mais do que eu.\n"
								+ "Puck: Muito obrigado, mago poderoso, você é muito generoso\n"
								+ "*mastiga mastiga*\n\n");
						
						printWithDelay("De repente surge muitas chamas de fogo e um demônio sai\n "
								+ "de dentro do fogo e mata Puck\n\n");
						
						printWithDelay(nome+" com os olhos arregalados: MINHA NOSSAAAAAAAAAAA\n"
								+ "ainda bem que eu não comi aquela coisa.\n");
						comp2.batalhaDemon(nome);
						break;
					case 2:
						opc_DarouNao = 2;
						printWithDelay(nome+": Eu que não vou te dar minha maçã mágica, ta louco?\n"
								+ "Eu vou precisar dos poderes dela quando for lutar contra o dragão\n"
								+ "Isso ai é só um simples machucado, jaja passa.\n");
						comp2.batalhaDemon(nome);
						break;
					default:
						opc_DarouNao = 3;
						printWithDelay("Faça uma escolha válida\n");
					}
				}while(opc_DarouNao < 1 || opc_DarouNao >= 3);
				break;
				default:
					opc_Cam = 3;
					printWithDelay("Faça uma escolha válida\n");
				
			}
		}while(opc_Cam < 1 || opc_Cam >= 3);
	}
		
	
	// Método main
		public static void main(String[] args)throws InterruptedException{
			Scanner ent = new Scanner(System.in);
			A_princesa_e_o_mago comp1 = new A_princesa_e_o_mago();
			
			printWithDelay("Eu sou um mago poderoso cujo nome é...");
			
			String nome;
			printWithDelay("Qual seu nome?");
			nome=ent.next();
			
			printWithDelay("\nEu sou um mago poderoso, cujo nome é " +nome+ ". Vivo em uma torre no topo de uma colina,\n"
					+ "estudando e praticando minhas habilidades mágicas. Um dia, um corvo chamado Krakus veio me\n"
					+ "contar algo sobre uma princesa capturada e que ela precisava da minha ajuda.\n\n");
			
			printWithDelay("Krakus: AAA " +nome+ ", você não vai acreditar no que aconteceu!!!\n"
					+ nome+": O que houve?\n"
					+ "Krakus: AAA Você não ta sabendo da história da princesa presa na caverna do dragão, perto das montanhas? Já tem semanas.\n"
					+ nome+" pensou: *É o meu dever salvar essa princesa e derrotar esse dragão, mas eu preciso me preparar para essa batalha.*\n\n");
			
			printWithDelay("Opção 1: treinar magia negra.\n"
					+ "Opção 2: treinar defesa.\n"
					+ "Opção 3: não treinar e ir direto para a batalha.\n");
			
			int opc_Treino;
			do {
				printWithDelay("Escolha uma das opções:");
				opc_Treino=ent.nextInt();
				
				
					switch(opc_Treino){
					case 1:
						opc_Treino = 1;
						printWithDelay("AO TENTAR USAR MAGIA NEGRA VOCÊ INVOCOU UM DEMÔNIO PODEROSO E ELE TE MATOU ☠\nFIM DE JOGO☠");
						break;
					case 2:
						opc_Treino = 2;
						printWithDelay("Você está pronto para partir e derrotar o dragão.\n");
						comp1.caminho(nome);
						break;
					case 3:
						opc_Treino = 3;
						printWithDelay("Você decide não treinar, pois está confiante que treinou o suficiente e parte em direção\n"
								+ "as montanhas em busca da princesa.\n");
						comp1.caminho(nome);
						break;
					default:
						opc_Treino = 4; 
						printWithDelay("O mago não conhece esse tipo de treinamento. Tente novamente.\n");
					}
			}while(opc_Treino >= 4 || opc_Treino < 1);

		}
	}
