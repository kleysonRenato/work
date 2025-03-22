@packaged com.example.sinodal.model.Sobreclubes;
@Entity
class EstatisticasClube {
// Compare this snippet from sinodal/src/main/resources/model/Sobreclubes.JAVA:
    @Id @GeneratedValue
    private Long id;
    private Int Formação;
    private String Jogos;
    private Int Vitorias;
    private Int Empates;
    private String Derrotas;
    private String Gols;
    private String Golssofridos;
    private String campeonatos vencidos;
    private String campeonatos a disputar;
    private Int Jogadores;
    private String Técnico;
    private Int socios;
   
    @OneToMany
    private List<Nivel> niveis;
}