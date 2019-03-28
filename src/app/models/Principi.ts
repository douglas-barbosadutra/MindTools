import  {Feedback} from './Feedback';


export class Principi {
    idPrincipi: number;
    nome: string;
    dPunti: string;
    dNumeri: string;
    pChiave: string;
    nomeIta: string;
    dPuntiIta: string;
    dNumeriIta: string;  
    pChiaveIta: string;
    feedback: Feedback[];

    // tslint:disable-next-line:max-line-length
    constructor( idPrincipi: number, nome: string,dPunti: string, dNumeri: string, pChiave: string,  nomeIta: string, dPuntiIta: string, dNumeriIta: string, pChiaveIta: string, feedback: Feedback[]  ) {
        this.idPrincipi = idPrincipi;    
        this.nome = nome;
        this.dPunti = dPunti;
        this.dNumeri =dNumeri;
        this.pChiave = pChiave;
        this.nomeIta = nomeIta;
        this.dNumeriIta = dNumeriIta;
        this.pChiaveIta = pChiaveIta;
        this.feedback = feedback;
    }

}