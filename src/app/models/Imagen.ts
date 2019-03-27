import  {Experience} from './Experience';


export class Imagen{
    idImagen: number;
    nomeimg: string;
    archivo: ByteLengthChunk[];
    experience: Experience[];

    // tslint:disable-next-line:max-line-length
    constructor( idImagen: number, nomeimg: string,archivo: ByteLengthChunk[], experience: Experience[])
    {
        this.idImagen = idImagen;
        this.nomeimg =nomeimg;
        this.archivo =archivo;
        this.experience = experience;
        
    }

}