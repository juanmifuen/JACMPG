import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import ApiService from '../../service/ApiService';

const AdminPage = () => {
    const [adminName, setAdminName] = useState('');
    const navigate = useNavigate();

    useEffect(() => {
        const fetchAdminName = async () => {
            try {
                const response = await ApiService.getUserProfile();
                setAdminName(response.user.name);
            } catch (error) {
                console.error('Error al obtener los datos del administrador:', error.message);
            }
        };

        fetchAdminName();
    }, []);

    return (
        <div className="admin-page">
            <h1 className="welcome-message">Bienvenido sr, {adminName}</h1>
            <div className="admin-actions">
                <button className="admin-button" onClick={() => navigate('/admin/manage-rooms')}>
                Gestionar Habitaciones
                </button>
                <button className="admin-button" onClick={() => navigate('/admin/manage-bookings')}>
                Gestionar reservas
                </button>
            </div>
        </div>
    );
}

export default AdminPage;
