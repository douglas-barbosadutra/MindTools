import  {Experience} from './Experience';
import  {Principi} from './Principi';

export class Feedback{
    idFeedback: number;
    idExperience: number;
    principi: Principi[];
     secondario: Principi[];

     // tslint:disable-next-line:max-line-length
    constructor( idFeedback: number,idExperience: number, secondario: Principi[],principi: Principi[], )
    {
        this.idFeedback = idFeedback;
        this.idExperience = idExperience;
        this.secondario =secondario;
        this.principi =principi;
       
    }

}