export class ParamDTO{
    
    jwt: string; 
    param: Object;
    

    constructor( jwt: string, param: Object){
            this.jwt = jwt;
            this.param = param;
        }
}