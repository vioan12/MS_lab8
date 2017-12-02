import java.util.ArrayList;
import java.util.List;

/**
 * Created by ioan on 12/2/17.
 */
public class ProducersConsumers extends PetriNet
{
    int m,n,k;
    ProducersConsumers(int valueofm, int valueofn, int valueofk)
    {
        Tranzitie tranzitia1,tranzitia2,tranzitia3,tranzitia4;
        Arc arcul1,arcul2,arcul3,arcul4,arcul5,arcul6,arcul7,arcul8,arcul9,arcul10,arcul11,arcul12,arcul13,arcul14,arcul15,arcul16;
        Locatie locatia1,locatia2,locatia3,locatia4,locatia5,locatia6,locatia7;

        this.m=valueofm;
        this.n=valueofn;
        this.k=valueofk;
        List<Arc> templistaarce;
        Tranzitii = new ArrayList<Tranzitie>();

        locatia1 =  new Locatie("Producers",m);
        arcul4 = new Arc(locatia1,1,"in");
        arcul1 = new Arc(locatia1,1,"out");

        locatia2 =  new Locatie("Consumers",n);
        arcul9 = new Arc(locatia2,1,"in");
        arcul12 = new Arc(locatia2,1,"out");

        locatia3 =  new Locatie("Elements Ready for Write",0);
        arcul2 = new Arc(locatia3,1,"in");
        arcul3 = new Arc(locatia3,1,"out");

        locatia4 =  new Locatie("Elements Ready for Read",0);
        arcul11 = new Arc(locatia4,1,"in");
        arcul10 = new Arc(locatia4,1,"out");

        locatia5 =  new Locatie("Free spots",k);
        arcul14 = new Arc(locatia5,1,"in");
        arcul5 = new Arc(locatia5,1,"out");

        locatia6 =  new Locatie("Mutex",1);
        arcul16 = new Arc(locatia6,1,"in");
        arcul8 = new Arc(locatia6,1,"in");
        arcul7 = new Arc(locatia6,1,"out");
        arcul15 = new Arc(locatia6,1,"out");

        locatia7 =  new Locatie("Full spots",0);
        arcul6 = new Arc(locatia7,1,"in");
        arcul13 = new Arc(locatia7,1,"out");

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul1);
        templistaarce.add(arcul2);
        tranzitia1 = new Tranzitie("Produce",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul10);
        templistaarce.add(arcul9);
        tranzitia2 = new Tranzitie("Consume",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul3);
        templistaarce.add(arcul5);
        templistaarce.add(arcul7);
        templistaarce.add(arcul4);
        templistaarce.add(arcul6);
        templistaarce.add(arcul8);
        tranzitia3 = new Tranzitie("PUSH",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul12);
        templistaarce.add(arcul13);
        templistaarce.add(arcul15);
        templistaarce.add(arcul11);
        templistaarce.add(arcul14);
        templistaarce.add(arcul16);
        tranzitia4 = new Tranzitie("POP",templistaarce);

        Tranzitii.add(tranzitia1);
        Tranzitii.add(tranzitia2);
        Tranzitii.add(tranzitia3);
        Tranzitii.add(tranzitia4);

    }
    protected void afisare_taglocatiejeton()
    {
        List<Locatie> listalocatii;
        listalocatii=starejetoatelocatii();
        for(int i=0;i<listalocatii.size();i++){
            System.out.println(listalocatii.get(i).Get_tag()+": "+listalocatii.get(i).Get_jetoane());
        }
    }
}
