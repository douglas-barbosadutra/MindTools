import  {Experience} from './Experience';
import  {Principi} from './Principi';

export class Feedback{
    idFeedback: number;
    secondario: number;
    principi: Principi[];
    experience: Experience[];

    // tslint:disable-next-line:max-line-length
    constructor( idFeedback: number, secondario: number,principi: Principi[], experience: Experience[])
    {
        this.idFeedback = idFeedback;
        this.secondario =secondario;
        this.principi =principi;
        this.experience = experience;
        
    }

}