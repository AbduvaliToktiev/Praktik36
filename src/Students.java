public class Students implements Comparable<Long>{
  private Long id;
  private String FIO;
  private Double gpa;

    public Students(Long id, String FIO, Double gpa) {
        this.id = id;
        this.FIO = FIO;
        this.gpa = gpa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Long o) {
        return 0;
    }
}
