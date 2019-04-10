import  {Experience} from './Experience';
import  {Principi} from './Principi';

import  {Feedback} from './Feedback';

export class FeedbackPrincipiExperience{
    
    id_experience: number;
    id_principi: number;
    
    secondario: Principi[];
  

    // tslint:disable-next-line:max-line-length
    constructor(  id_experience: number, id_principi: number, secondario: Principi[])
    {
        this.id_experience = id_experience;
        this.id_principi= id_principi;
        
        
        this.secondario= secondario;
       
        
       
        
    }

}