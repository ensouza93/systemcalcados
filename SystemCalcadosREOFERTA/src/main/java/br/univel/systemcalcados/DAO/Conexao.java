package br.univel.systemcalcados.DAO;

//public class Conexao {
//	
//	
//
//	private static Conexao self = null;
//	
//	private EntityManagerFactory fabrica;
//
//	private EntityManager em;
//	
//	private Conexao() {
//		fabrica = Persistence.createEntityManagerFactory("systemcalcados");
//		em = fabrica.createEntityManager();
//		
//		//executa esta thread quando fechar a aplicação
//		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//			
//			public void run() {
//				System.out.println("fechando conexões.");
//				em.close();
//				fabrica.close();				
//			}
//			
//		}));
//	}
//    
//    public synchronized static EntityManager getEntityManager() {
//    	if (self == null){
//    		self = new Conexao();
//    	}
//    		
//    	return self.em;
//    }
//    
//
//
//}
