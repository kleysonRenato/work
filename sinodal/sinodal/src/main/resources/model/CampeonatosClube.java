@packaged com.example.sinodal.model.Sobreclubes;
@Entity
class Campeonatos {
// Compare this snippet from sinodal/src/main/resources/model/Sobreclubes.JAVA:
    @Id @GeneratedValue
    private Long id;
    private String campeonatos Disputadando;
    private String divisão;
    private Int total de titulos;
    private Int rebaixamentos;


    @OneToMany
    private List<Nivel> niveis;
}