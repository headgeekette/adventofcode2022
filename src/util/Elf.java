package util;

public class Elf implements Comparable<Elf>{
    private Integer id;
    private Integer total;

    public Elf (Integer id, Integer total) {
        this.id = id;
        this.total = total;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public int compareTo(Elf o) {
        return total.compareTo(o.total);
    }
}
