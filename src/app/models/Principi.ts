import  {Feedback} from './Feedback';


export class Principi {
    idPrincipi: number;
    nome: string;
    dPunti: string;
    dNumeri: string;
    pChiave: string;
    fronte: ByteLengthChunk[];
    retro: ByteLengthChunk[]; 
    feedback: Feedback[];

    // tslint:disable-next-line:max-line-length
    constructor( idPrincipi: number, nome: string,dPunti: string, dNumeri: string, pChiave: string, fronte : ByteLengthChunk[], retro : ByteLengthChunk[], feedback: Feedback[]  ) {
        this.idPrincipi = idPrincipi;    
        this.nome = nome;
        this.dPunti = dPunti;
        this.dNumeri =dNumeri;
        this.pChiave = pChiave;
        this.fronte = fronte;
        this.retro = retro;
        this.feedback = feedback;
    }

}